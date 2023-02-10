public class Skill implements Item {
    private String title;
    private String description;
    private Item.itemType type;

    public Skill() {
        this.title = "Empty";
        this.description = "Empty";
        this.type = Item.itemType.SKILL;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Item.itemType getType() {
        return this.type;
    }

    @Override
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public void setDescription(String newDescription) {
        this.description = newDescription;

    }

    @Override
    public void setType(itemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Skill\n   Title: " + title + "\n   Description: " + description;
    }

}