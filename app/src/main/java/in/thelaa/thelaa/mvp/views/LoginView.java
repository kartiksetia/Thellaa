package in.thelaa.thelaa.mvp.views;

/**
 * Created by Kartik on 8/16/16.
 */
public interface LoginView {

    /**
     * Shows an error dialog.
     * @param title The title of the dialog.
     * @param message The message of the dialog.
     */
    void showErrorDialog(String title, String message);
}
