public class Dragon  extends  Enemy{

    protected String _color;
    protected int answer;
    protected String _quest;


    public void setAnswer(int answer) {
        this.answer = answer;
    }


    public  boolean Check_answer(int _answer){
        if(_answer == answer) return true;

        else return false;
    }


    public void question(String quest){
        _quest = quest;
        }
}
