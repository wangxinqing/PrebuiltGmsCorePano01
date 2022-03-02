package com.google.firebase.auth;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class FirebaseAuth implements apvw {
    public static FirebaseAuth getInstance() {
        synchronized (aplb.a) {
            if (((aplb) aplb.b.get("[DEFAULT]")) == null) {
                String a = jkt.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(a);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        throw null;
    }

    public static FirebaseAuth getInstance(aplb aplb) {
        throw null;
    }
}
