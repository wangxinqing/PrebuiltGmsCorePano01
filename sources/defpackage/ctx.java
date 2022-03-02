package defpackage;

/* renamed from: ctx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctx extends ej {
    public ctx() {
        super(7, 8);
    }

    public final void a(di diVar) {
        diVar.b("DROP TABLE resource_info");
        diVar.b("CREATE TABLE resource_info (accountName TEXT NOT NULL, language TEXT NOT NULL,  resourceKey BLOB NOT NULL, resource BLOB, lastUpdatedMs INTEGER, darkModeEnabled INTEGER NOT NULL, PRIMARY KEY (accountName, language, resourceKey, darkModeEnabled))");
    }
}
