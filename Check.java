public class Check extends Game{


    public static char rows(){
        for(int i = 0; i< SIZE; i++){
            int counterX = 0;
            int counterO = 0;
            for(int j = 0; j< SIZE; j++){
                if(field[i][j] == 'X'){
                    counterX++;
                }   else if(field[i][j] == 'O'){
                    counterO++;
                }
            }
            if(counterX == SIZE){
                return 'X';
            }
            if(counterO == SIZE){
                return 'O';
            }
        }
        return '/';
    }


    public static char cols(){
        for(int i = 0; i< SIZE; i++){
            int counterX = 0;
            int counterO = 0;
            for(int j = 0; j< SIZE; j++){
                if(field[j][i] == 'X'){
                    counterX++;
                }   else if(field[j][i] == 'O'){
                    counterO++;
                }
            }
            if(counterX == SIZE){
                return 'X';
            }
            if(counterO == SIZE){
                return 'O';
            }
        }
        return '/';
    }


    public static char diagonal1(){

        int counterX = 0;
        int counterY = 0;
        for(int i = 0; i< SIZE; i++){
            if(field[i][SIZE -1-i] == 'X'){
                counterX++;
            }   else if(field[i][SIZE -1-i] == 'O'){
                counterY++;
            }
            if(counterX == SIZE){
                return 'X';
            }
            if(counterY == SIZE){
                return 'O';
            }
        }
        return '/';
    }


    public static char diagonal2(){

        int counterX = 0;
        int counterY = 0;
        for(int i = 0; i< SIZE; i++){
            if(field[i][i] == 'X'){
                counterX++;
            }   else if(field[i][i] == 'O'){
                counterY++;
            }
            if(counterX == SIZE){
                return 'X';
            }
            if(counterY == SIZE){
                return 'O';
            }
        }
        return '/';
    }

    public static boolean deathheat(){
        int counter = 0;
        for(int i = 0; i< SIZE; i++){
            for(int j = 0; j< SIZE; j++){
                if(field[i][j] == ' '){
                    counter++;
                }
            }
        }
        return counter == 0;
    }


}
