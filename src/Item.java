public interface Item {
    enum itemType {
        ITEM, POSITION, PROJECT, SKILL
    };

    public String getTitle();

    public String getDescription();

    public itemType getType();

    public void setTitle(String newTitle);

    public void setDescription(String newDescription);

    public void setType(itemType type);

    public String toString();

}