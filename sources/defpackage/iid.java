package defpackage;

import android.content.Intent;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iid {
    public final AudienceMember a;
    public final int b;
    public final int c;
    private final String d;

    public iid(int i, AudienceMember audienceMember, int i2, String str) {
        this.b = i;
        this.a = audienceMember;
        this.c = i2;
        this.d = str;
        b();
    }

    private final void b() {
        iva.a(this.b, (Object) "Invalid create circle status code.");
        iva.a(this.c, (Object) "Invalid add person status code.");
        if (this.b == 1) {
            iva.a((Object) this.a.d, (Object) "Must provide a circle with circle id.");
            iva.a((Object) this.a.f, (Object) "Must provide a circle with display name.");
        }
        if (this.c == 1) {
            iva.a((Object) this.d, (Object) "Must provide qualified id.");
        }
    }

    public final Intent a() {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_CREATE_CIRCLE_STATUS_CODE", this.b);
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_CIRCLE", this.a);
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_ADD_PERSON_STATUS_CODE", this.c);
        intent.putExtra("com.google.android.gms.plus.audience.EXTRA_QUALIFIED_ID", this.d);
        return intent;
    }

    public iid(Intent intent) {
        this.b = intent.getIntExtra("com.google.android.gms.plus.audience.EXTRA_CREATE_CIRCLE_STATUS_CODE", 0);
        this.a = (AudienceMember) intent.getParcelableExtra("com.google.android.gms.plus.audience.EXTRA_CIRCLE");
        this.c = intent.getIntExtra("com.google.android.gms.plus.audience.EXTRA_ADD_PERSON_STATUS_CODE", 0);
        this.d = intent.getStringExtra("com.google.android.gms.plus.audience.EXTRA_QUALIFIED_ID");
        b();
    }
}
