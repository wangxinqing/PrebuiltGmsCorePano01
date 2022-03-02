package defpackage;

import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgx extends je {
    private final Context E;
    private final List F = new ArrayList();

    public tgx(Context context, String str) {
        super(context, str);
        this.E = context;
    }

    public final /* bridge */ /* synthetic */ void a(PendingIntent pendingIntent) {
        this.f = pendingIntent;
    }

    /* renamed from: b */
    public final void a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        super.a(hdg.a(this.E, i), charSequence, pendingIntent);
    }

    public final /* bridge */ /* synthetic */ void c() {
        this.r = true;
    }

    public final void d(PendingIntent pendingIntent) {
        super.b(pendingIntent);
    }

    public final void f() {
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList = new ArrayList(this.F.size());
            List list = this.F;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                the the = (the) list.get(i);
                Person.Builder builder = new Person.Builder();
                boolean z = the.d;
                Person.Builder bot = builder.setBot(false);
                boolean z2 = the.e;
                Person.Builder important = bot.setImportant(false);
                CharSequence charSequence = the.a;
                if (charSequence != null) {
                    important.setName(charSequence);
                }
                Icon icon = the.b;
                if (icon != null) {
                    important.setIcon(icon);
                }
                String str = the.c;
                if (str != null) {
                    important.setKey(str);
                }
                arrayList.add(important.build());
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("android.people.list", arrayList);
            super.a(bundle);
        }
    }

    public final void g() {
        super.a(false);
    }

    public final void h() {
        super.a(-1);
    }

    public final void i() {
        super.b(true);
    }

    public final void j() {
        super.b(hdg.a(this.E, R.drawable.sharing_ic_notification));
    }

    public final void b(Bitmap bitmap) {
        super.a(bitmap);
    }

    public final void c(int i) {
        super.a(10000, i, false);
    }

    public final void d(boolean z) {
        super.c(z);
    }

    public final void g(CharSequence charSequence) {
        super.e(charSequence);
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", str);
        super.a(bundle);
    }

    public final void b(Uri uri) {
        super.a(uri);
    }

    public final void b(jh jhVar) {
        super.a(jhVar);
    }

    public final void b(long[] jArr) {
        super.a(jArr);
    }

    public final void f(CharSequence charSequence) {
        super.b(charSequence);
    }
}
