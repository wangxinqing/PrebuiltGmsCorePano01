package defpackage;

import android.text.TextUtils;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgi implements abkj, ablg {
    private abgh a;
    private boolean b;
    private aviq c;
    private final List d;

    public abgi(String str, String str2, String str3) {
        this.a = new abgh(str, (String) null, str2 == null ? str3 : str2);
        this.d = new ArrayList();
        this.b = false;
    }

    private final void a() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((abgg) list.get(i)).a(this.a);
        }
    }

    private final void a(aviq aviq) {
        if (!this.a.a() || !this.a.b()) {
            abgh abgh = this.a;
            String str = abgh.a;
            boolean z = true;
            boolean z2 = false;
            if (!abgh.a() && !aviq.a.isEmpty()) {
                str = aviq.a;
                z2 = true;
            }
            String str2 = this.a.b;
            if (!aviq.d.isEmpty()) {
                str2 = aviq.d;
            } else {
                z = z2;
            }
            if (z) {
                this.a = new abgh(str, str2, this.a.c);
                a();
            }
        }
    }

    public final void a(abgg abgg) {
        if (this.a.a() || this.a.c()) {
            abgg.a(this.a);
        }
        this.d.add(abgg);
    }

    public final void a(abgl abgl) {
        if (abgl.c()) {
            aviq aviq = abgl.d;
            if (this.b) {
                a(aviq);
            } else {
                this.c = aviq;
            }
        }
    }

    public final void a(Person person) {
        this.b = true;
        if (!this.a.a() && person.K()) {
            List list = ((PersonImpl) person).u;
            int size = list.size();
            int i = 0;
            while (i < size) {
                Person.Names names = (Person.Names) list.get(i);
                if (TextUtils.isEmpty(names.e()) || !"contact".equals(names.b().b())) {
                    i++;
                } else {
                    this.a = new abgh(names.e(), (String) null, this.a.c);
                    a();
                    return;
                }
            }
        }
        aviq aviq = this.c;
        if (aviq != null) {
            a(aviq);
        }
    }
}
