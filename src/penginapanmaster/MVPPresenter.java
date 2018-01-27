/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster;

import java.lang.ref.WeakReference;

/**
 *
 * @author Lukman
 */
public abstract class MVPPresenter<V extends MVPContract.View> implements MVPContract.Presenter<V> {
    private WeakReference<V> viewRef;

    @Override
    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }

    @Override
    public void attachView(V view) {
        viewRef = new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }
}
