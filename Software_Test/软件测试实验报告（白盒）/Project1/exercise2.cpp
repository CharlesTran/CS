#include<iostream>
using namespace std;
int judge_m(int m) {
	if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		return 1;
	else if (m == 4 || m == 6 || m == 9 || m == 11)
		return 2;
	else if (m == 2)
		return 3;
	else
		return 4;
}
int judge(int y, char a, int m, char c, int d)
{
	if (y <= 2050 && y >= 1970 && a == '-' && c == '-')
		if (judge_m(m) == 1 && d <= 31 && d >= 1)
			return 0;
		else if (judge_m(m) == 2 && d <= 30 && d >= 1)
			return 0;
		else if (judge_m(m) == 3 && (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) && d <= 28 && d >= 1)
			return 0;
		else if (judge_m(m) == 3 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && d <= 29 && d >= 1)
			return 0;
		else
			return 1;
	else
		return 1;
}
int main()
{
	int y, m, d;
	char a, c;
	cout << "Pleasr Input: ";
	cin >> y;
	a = getchar();
	cin >> m;
	c = getchar();
	cin >> d;
	while (judge(y,m,d,a,c)) {
			cout << "Input Error!" << endl;
			cout << "Pleasr Input again: ";
			cin >> y;//4294969297-10-11
			a = getchar();
			cin >> m;
			c = getchar();
			cin >> d;
	}
	if (judge_m(m) == 1) {
		d++;
		if (d > 31) {
			d = 1;
			m++;
			if (m > 12) {
				m = 1;
				y++;
			}
		}
	}
	else if (judge_m(m) == 2) {
		d++;
		if (d == 31) {
			d = 1;
			m++;
			if (m > 12) {
				m = 1;
				y++;
			}
		}
	}
	else if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
		d++;
		if (d == 30) {
			d = 1;
			m++;
		}
	}
	else {
		d++;
		if (d == 29)
		{
			d = 1;
			m++;
		}
	}
	cout << y << '-' << m << '-' << d << endl;
	return 0;
}