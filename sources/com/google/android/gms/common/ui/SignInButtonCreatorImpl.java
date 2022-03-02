package com.google.android.gms.common.ui;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.SignInButtonConfig;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SignInButtonCreatorImpl extends iuj {
    public static final String CHIMERA_MODULE_ID = "com.google.android.gms.signinbutton_dynamite";
    private Lock a = new ReentrantLock();
    private Context b;
    private Context c;

    private final mby a(mby mby, jgj jgj) {
        Context context = (Context) mbz.a(mby);
        this.a.lock();
        try {
            Context applicationContext = context.getApplicationContext();
            Context context2 = this.b;
            if (context2 == null || applicationContext != context2) {
                Context a2 = hep.a(applicationContext, CHIMERA_MODULE_ID);
                if (a2 == null) {
                    Log.e("SignInButtonProxy", "Unexpected null moduleContext for: com.google.android.gms.signinbutton_dynamite. newCreator failed and will return null");
                    return null;
                }
                this.c = a2;
                this.b = applicationContext;
            }
            this.a.unlock();
            try {
                iuk asInterface = iuj.asInterface(hep.a(this.c.getClassLoader(), "com.google.android.gms.common.ui.SignInButtonCreatorChimeraImpl"));
                if (asInterface != null) {
                    return jgj.a(asInterface, mbz.a((Object) new Context[]{this.c, context}));
                }
                Log.e("SignInButtonProxy", "Failed to get the actual SignInButtonCreator.");
                return null;
            } catch (RemoteException e) {
                Log.e("SignInButtonProxy", "Failed to create SignInButton using dynamite package", e);
            }
        } finally {
            this.a.unlock();
        }
    }

    public mby newSignInButton(mby mby, int i, int i2) {
        return a(mby, new jgh(i, i2));
    }

    public mby newSignInButtonFromConfig(mby mby, SignInButtonConfig signInButtonConfig) {
        return a(mby, new jgi(signInButtonConfig));
    }
}
