import System.CPUTime -- timer
import System.Random --( getStdRandom, Random(randomR) )


drawInt::Int->Int->IO Int
drawInt x y = getStdRandom(randomR (x,y))

randarray::Int->IO [Int]
randarray 0 = return []
randarray n = do
  a <- drawInt 1 n
  rest <- (randarray (n-1))
  return (a:rest)

randmul1::Int->IO [[Int]]
randmul1 0= return [[]]
randmul1 n= do
  a<- randarray 300
  rest <- randmul1 (n-1) 
  return (a:rest)

randmul2::Int->IO [[Int]]
randmul2 0= return [[]]
randmul2 n= do
  a<- randarray 400
  rest <- randmul2 (n-1) 
  return (a:rest)

multiply :: Num a => [[a]] -> [[a]] -> [[a]]
multiply us vs = map (mult [] vs) us
  where
    mult xs [] _ = xs
    mult xs _ [] = xs
    mult [] (zs : zss) (y : ys) = mult (map (y *) zs) zss ys
    mult xs (zs : zss) (y : ys) =
      mult
        (zipWith (\u v -> u + v * y) xs zs)
        zss
        ys
 
main :: IO ()
main = do
  s <- getCPUTime
  matrix1<-randmul1 200
  let matrixa = init matrix1
  matrix2<-randmul2 300
  let matrixb = init matrix2
  --print $ matrixa
  --print $ matrixb
  mapM_ print $
    multiply matrixa matrixb
  e <- getCPUTime
  putStrLn $ show (fromIntegral (e - s) / 10^12) ++ " seconds"