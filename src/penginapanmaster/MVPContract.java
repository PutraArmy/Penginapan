/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapanmaster;

/**
 *
 * @author Lukman
 */
public class MVPContract {
    interface View {}
    
    interface Presenter<V extends View>{
        V getView();
        void attachView(V view);
        void detachView();
    }
    
    interface Component<P extends Presenter>{
        P presenter();
    }
}
