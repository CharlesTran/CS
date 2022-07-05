#include "pch.h"

TEST(TestCaseName, TestName) {
  EXPECT_EQ(0, judge(2021,'-', 11, '-', 1));
  EXPECT_EQ(1, judge(2021,' ', 2,' ', 28));
  EXPECT_EQ(1, judge(1969,'-',12,'-', 31));
  EXPECT_EQ(1, judge(2021,'-',10,'-',32));
  EXPECT_EQ(1, judge(2021, '-',13, '-',2));
  EXPECT_EQ(1, judge(2092,' ', 14,' ', 6));
  EXPECT_EQ(0, judge(2000, '-',2, '-',28));
  EXPECT_EQ(0, judge(2000, '-',2, '-',29));
  EXPECT_EQ(0, judge(2050, '-',12, '-',31));
  EXPECT_EQ(1, judge_m(1));
  EXPECT_EQ(1, judge_m(3));
  EXPECT_EQ(1, judge_m(5));
  EXPECT_EQ(1, judge_m(7));
  EXPECT_EQ(1, judge_m(8));
  EXPECT_EQ(1, judge_m(10));
  EXPECT_EQ(1, judge_m(12));
  EXPECT_EQ(2, judge_m(4));
  EXPECT_EQ(2, judge_m(6));
  EXPECT_EQ(2, judge_m(9));
  EXPECT_EQ(2, judge_m(11));
  EXPECT_EQ(3, judge_m(2));
  EXPECT_EQ(4, judge_m(13));
  EXPECT_EQ(4, judge_m(-1));
}