package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FirebaseMessagingRegistrar {
    public List getComponents() {
        apwa a = apwb.a(FirebaseMessaging.class);
        a.a(apwd.b(aplb.class));
        a.a(apwd.b(FirebaseInstanceId.class));
        a.a(apwd.b(apxb.class));
        a.a(apwd.b(apwp.class));
        a.a(apwd.a(clq.class));
        a.a(apwd.b(apwt.class));
        a.a(apww.a);
        a.b();
        return Arrays.asList(new apwb[]{a.a(), apxa.a("fire-fcm", "20.2.1")});
    }
}
