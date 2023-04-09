import java.util.Date;

public class User {
    private Date birthDate;
    private float size;
    private Photos photos;
    private Address address;

    public User(Date birthDate, float size, Photos photos, Address address) {
        this.birthDate = birthDate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
