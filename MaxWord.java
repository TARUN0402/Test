//1st Question
class MaxWord
{
    static String maxWord="";
    static void maxLengthWords(String input)
    {
        input=input.trim();

        int len=input.length();
        int si=0,ei=0;
        int max_length=0,max_start_index=0,min_length=0,min_start_index=0;
        while(ei<=len)
        {
            if(ei<len && input.charAt(ei)!=' ')
            {
                ei++;
            }
            else
            { 
                int curr_length=ei-si;
                if(curr_length<min_length)
                {
                    min_length=curr_length;
                    min_start_index=si;
                }
                if(curr_length>max_length)
                {
                    max_length=curr_length;
                    max_start_index=si;
                }
                ei++;
                si=ei;
            }
        }
        maxWord=input.substring(max_start_index,max_start_index+max_length);
    }

    public static void main(String args[]) {
        String a="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English";
        maxLengthWords(a);
        System.out.print(maxWord);
    }
}