package es.ulpgc.eite.clean.mvp.dummy.app;

import es.ulpgc.eite.clean.mvp.dummy.dummy.Dummy;
public interface Navigator {
  void goToNextScreen(Dummy.DummyTo presenter);
}
