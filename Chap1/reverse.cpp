// Implement a function void reverse(char* str) in C or C++ which reverses a 
// null-terminated string.

#include<iostream>
#include<cstdlib>

using namespace std;
void reverseString(char *str)
{
	int length = 0;
	char *end = str;
	while(*end != '\0') {
		length++;
		end++;
	}
	cout<<"length : " << length << endl;
	end--;

	while(str < end) {
		char temp = *str;
		*str++ = *end;
		*end-- = temp;
	}
}

int main(void) {
	char str[] = "hello world";
	reverseString(str);
	cout << "Reversed string : " << str << endl;
}