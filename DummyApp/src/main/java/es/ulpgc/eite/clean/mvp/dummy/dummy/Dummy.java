package es.ulpgc.eite.clean.mvp.dummy.dummy;

import android.content.Context;

import es.ulpgc.eite.clean.mvp.ContextView;
import es.ulpgc.eite.clean.mvp.Model;
import es.ulpgc.eite.clean.mvp.Presenter;

/**
 * Created by Luis on 12/11/16.
 */

public interface Dummy {


  ///////////////////////////////////////////////////////////////////////////////////
  // State /////////////////////////////////////////////////////////////////////////

  interface ToDummy {
    void onScreenStarted();
    void setToolbarVisibility(boolean visible);
    void setTextVisibility(boolean visible);
  }

  interface DummyTo {
    Context getManagedContext();
    void destroyView();
    boolean isToolbarVisible();
    boolean isTextVisible();
  }

  ///////////////////////////////////////////////////////////////////////////////////
  // Screen ////////////////////////////////////////////////////////////////////////

  /**
   * Methods offered to VIEW to communicate with PRESENTER
   */
  interface ViewToPresenter extends Presenter<PresenterToView> {
    void onButtonClicked();
  }

  /**
   * Required VIEW methods available to PRESENTER
    Required PRESENTER methods available to MODEL */
   interface PresenterToView extends ContextView {
   void finishScreen();
   void hideToolbar();
   void hideText();
   void showText();
   void setText(String txt);
   void setLabel(String txt);
   }

   /**
   * Methods offered to MODEL to communicate with PRESENTER
   */
  interface PresenterToModel extends Model<ModelToPresenter> {
    void onChangeMsgByBtnClicked();
    String getText();
    String getLabel();
  }

  /**

   */
  interface ModelToPresenter {

  }
}
