package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Registrar {
    public List getComponents() {
        apwa a = apwb.a(FirebaseInstanceId.class);
        a.a(apwd.b(aplb.class));
        a.a(apwd.b(apwo.class));
        a.a(apwd.b(apxb.class));
        a.a(apwd.b(apwp.class));
        a.a(apwd.b(apwt.class));
        a.a(apwq.a);
        a.b();
        apwb a2 = a.a();
        apwa a3 = apwb.a(apws.class);
        a3.a(apwd.b(FirebaseInstanceId.class));
        a3.a(apwr.a);
        return Arrays.asList(new apwb[]{a2, a3.a(), apxa.a("fire-iid", "20.1.3")});
    }
}
