import java.util.List;

public interface PasswordDAO {
    public void insert(PasswordInfo p);
    public List<PasswordInfo> findAll();
    public PasswordInfo findByKey(String url);
    public void update(PasswordInfo p, String url);
    public void delete(String url);
    public void delete(PasswordInfo p);
}