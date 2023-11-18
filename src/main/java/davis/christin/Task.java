package davis.christin;

public class Task {
    private String title;
    private String description;
    private Person owner;
    private Boolean isComplete;
    private Category category;

    public Task(String title,
                Person owner,
                Category category){
        this.title = title;
        this.owner = owner;
        this.category = category;
        this.description = "";
        this.isComplete = false;
    }

    public Category getCategory(){
        return null;
    }
    public void setCategory(Category category){

    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Task: %s, Description: %s, Owner: %s, Category: %s, Is Complete: %b",
                title, description, owner.getFirstName(), category.toString(), isComplete));
        return builder.toString();
    }

}

