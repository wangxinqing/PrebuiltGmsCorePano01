package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.ImageReference;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abff implements abkj, ablg {
    public boolean a;
    public boolean b;
    private boolean c;
    private final jsx d;
    private final ablm e;
    private Bitmap f;
    private final List g = new ArrayList();
    private aviq h;

    public abff(jsx jsx, ablm ablm) {
        this.d = jsx;
        this.e = ablm;
    }

    private final void a(aviq aviq) {
        if (!aviq.b.isEmpty()) {
            a(aviq.b);
        }
    }

    public final void a(abfe abfe) {
        Bitmap bitmap;
        this.g.add(abfe);
        if (!this.b && (bitmap = this.f) != null) {
            abfe.a(bitmap);
        }
    }

    public final void a(abgl abgl) {
        if (abgl.c()) {
            aviq aviq = abgl.d;
            if (aviq.e) {
                this.b = true;
            } else if (this.a) {
            } else {
                if (this.c) {
                    a(aviq);
                } else {
                    this.h = aviq;
                }
            }
        }
    }

    public final void a(amri amri) {
        if (!this.b && amri.a()) {
            this.f = (Bitmap) amri.b();
            List list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((abfe) list.get(i)).a(this.f);
            }
        }
    }

    public final void a(Person person) {
        ImageReference g2;
        this.c = true;
        if (!this.a && !this.b) {
            if (person.y()) {
                List list = ((PersonImpl) person).n;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Person.Images images = (Person.Images) list.get(i);
                    if (!images.f() && (g2 = images.g()) != null && g2.c()) {
                        a(g2.d());
                        return;
                    }
                }
            }
            aviq aviq = this.h;
            if (aviq != null) {
                a(aviq);
            }
        }
    }

    public final void a(String str) {
        this.a = true;
        if (str.startsWith("content://com.android.contacts/display_photo/")) {
            ablm ablm = this.e;
            ablm.a.initLoader(13, (Bundle) null, new abll(ablm, str, new abfc(this)));
            return;
        }
        this.d.a(jpr.b(str), 13, new abfd(this));
    }
}
