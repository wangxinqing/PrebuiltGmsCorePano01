package defpackage;

/* renamed from: pol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pol implements Runnable {
    private final poo a;

    public pol(poo poo) {
        this.a = poo;
    }

    public final void run() {
        poo poo = this.a;
        if (!poo.g) {
            int i = poo.e(poo.d).getInt("db_version", -1);
            pnz.d("Current SMS db vesion = %d", Integer.valueOf(i));
            String[] strArr = poq.d;
            if (i < 3) {
                poo.e(poo.d).edit().clear().apply();
            }
            poo.e(poo.d).edit().putInt("db_version", 4).apply();
            pnz.d("Set SMS db vesion = %d", 4);
            poo.e(poo.d).edit().putBoolean("enable_sms_corpus_with_appdatasearchhelper", true).apply();
            poo.a(false);
            poj.a(poo.d);
            poo.g = true;
        }
    }
}
