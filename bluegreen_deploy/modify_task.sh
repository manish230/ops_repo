cd /home/ubuntu/ops_repo/bluegreen_deploy

blue_tgarn=$1
green_tgarn=$2
role=$3

if [ $role = 'green' ]
then
sed -i "s/$blue_tgarn/$green_tgarn/g" blue-service.json
elif [ $role = 'blue' ]
then
 sed -i "s/${green_tgarn}/${blue_tgarn}/g" blue-service.json
else
echo "chose role either green or blue "
fi
