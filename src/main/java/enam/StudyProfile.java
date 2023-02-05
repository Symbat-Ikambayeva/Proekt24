package enam;

public enum StudyProfile {
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика");

    private final String profileName;



    StudyProfile(String profileName){
        this.profileName=profileName;
    }

    public String getProfileName(){
        return  profileName;
    }
}
