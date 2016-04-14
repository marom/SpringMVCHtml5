package spring.mvc.bean;

/**
 * Created by maro on 14/04/16.
 */
public class User {

        private int idUser;
        private String username;
        private String password;
        private boolean enabled;

        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public boolean getEnabled() {
            return enabled;
        }
        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
        public int getIdUser() {
            return idUser;
        }
        public void setIdUser(int idUser) {
            this.idUser = idUser;
        }
}
