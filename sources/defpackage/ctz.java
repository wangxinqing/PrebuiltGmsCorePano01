package defpackage;

/* renamed from: ctz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctz extends ej {
    public ctz() {
        super(9, 10);
    }

    public final void a(di diVar) {
        diVar.b("DROP TABLE resource_info");
        diVar.b("CREATE TABLE resource_info (accountName TEXT NOT NULL, language TEXT NOT NULL, resourceKey BLOB NOT NULL, darkModeEnabled INTEGER NOT NULL,callingAndroidApp TEXT NOT NULL, resource BLOB,lastUpdatedMs INTEGER, PRIMARY KEY (accountName, language, resourceKey, darkModeEnabled, callingAndroidApp))");
    }
}
