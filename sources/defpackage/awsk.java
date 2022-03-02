package defpackage;

/* renamed from: awsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awsk implements awsj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.chromesync")).a();
        a = agvx.a(a2, "sync_subscription_api_grpc_host", "https://firebaseperusertopics-pa.googleapis.com/v1/perusertopics/");
        b = agvx.a(a2, "sync_subscription_api_server_scope", "https://www.googleapis.com/auth/firebase.messaging");
        c = agvx.a(a2, "sync_subscription_api_grpc_port", "8181035976");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }
}
