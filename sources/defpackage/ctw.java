package defpackage;

/* renamed from: ctw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctw extends ej {
    public ctw() {
        super(6, 7);
    }

    public final void a(di diVar) {
        diVar.b("DROP TABLE resource_info");
        diVar.b("CREATE TABLE resource_info (accountName TEXT NOT NULL, language TEXT NOT NULL,  resourceKey BLOB NOT NULL, resource BLOB, lastUpdatedMs INTEGER, darkModeEnabled INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (accountName, language, resourceKey, darkModeEnabled))");
    }
}
