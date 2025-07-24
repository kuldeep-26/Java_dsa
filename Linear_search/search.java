public class search{
    
    public static int lin_search(String menu[], String item){
        for(int i = 0; i < menu.length; i++){
            if(menu[i] == (item)){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String menu[] = {"Dosa","Chole Bhature","Frooty","Coca-Cola"};
        String item = "Frooty";
        int pos = lin_search(menu,item);
        if(pos == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println("Found at : " + pos);
        }
    }
}