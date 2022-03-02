package defpackage;

/* renamed from: fjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fjn implements amqy {
    static final amqy a = new fjn();

    private fjn() {
    }

    public final Object a(Object obj) {
        anaf anaf = (anaf) obj;
        iwd iwd = fjw.a;
        if (anaf.containsKey("credentials_enable_sync") && !((Boolean) anaf.get("credentials_enable_sync")).booleanValue()) {
            return false;
        }
        if (!anaf.containsKey("credentials_enable_service") || ((Boolean) anaf.get("credentials_enable_service")).booleanValue()) {
            return Boolean.valueOf(!((Boolean) anaf.getOrDefault("credentials_need_first_time_welcome", true)).booleanValue());
        }
        return false;
    }
}
