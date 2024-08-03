public class Finance {
    public static void main(String[] argc) {
        Finance f = new Finance();
        for(double i=19;i<30;i++) {
            for (int diffRate = -5; diffRate < 5; diffRate++) {
                if (f.process(i, 0, diffRate, 30)) {
                    System.out.println((int) i + "," + diffRate);
                    break;
                }
            }
        }
    }

    boolean process(double ratio, int inflation, int rateOfReturn, int numYears) {
        float expense = 120000;
        float corpus = (float) (expense * ratio);
        float corpus1=corpus;
        boolean max=true;
        boolean pass= true;
        int goodYear=numYears;
        int finalCorpus=0;
        float corpus2=corpus;
        for(int year=0;year<numYears;year++) {
            finalCorpus=(int)corpus;
            corpus-=expense;
            corpus+=(float)(rateOfReturn / 100d)*corpus;
            expense+=expense*inflation/100;
            if(corpus<0) {
                pass=false;
                goodYear=year;
                break;
            }
            if(corpus > corpus1) {
                corpus2=corpus1;
                corpus1=corpus;
            } else if (!max){
                if (year == 1) {
                    max = false;
                }
            }
        }
        return pass;
    }
}
