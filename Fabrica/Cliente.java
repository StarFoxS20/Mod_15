package Fabrica;

public class Cliente
{

    private String gradeRequest;
    private boolean HasCompanyContract;

    public Cliente(String gradeRequest, boolean HasCompanyContract)
    {
        this.gradeRequest = gradeRequest;
        this.HasCompanyContract = HasCompanyContract;
    }

    public Cliente(String a, String aFalse, Object o) {
    }

    public boolean HasCompanyContract()
        {
            return HasCompanyContract;
        }

         public String getGradeRequest()
        {
            return gradeRequest;
        }
}
