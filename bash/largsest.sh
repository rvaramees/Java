read -p "enter 3 numbers : " a b c
if [ $a -gt $b ] && [ $a -gt $c ];
then 
echo "$a is the goat"
elif [ $b -gt $c ] && [ $b -gt $a ];
then
echo "$b is goat"
else
echo "$c is goat"
fi

