public enum StudyProfile {
    MEDICINE("Медицина"), CHEMISTRY("Химия"), ENGINEER("Инженер");

    private String profileName;



    StudyProfile(String profileName){
        this.profileName=profileName;
    }

    public String getProfileName(){
        return  profileName;
    }
}
