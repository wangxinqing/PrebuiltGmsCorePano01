package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmg extends nis {
    private final ClientContext a;
    private final List b;
    private final wtb c;
    private final wmd d;
    private final wml e;
    private final String f;
    private final int g;

    public wmg(Context context, ClientContext clientContext, List list, wtb wtb, wmd wmd, wml wml, String str) {
        super(5, "ClassifyAccountTypes");
        this.a = clientContext;
        this.b = list;
        this.c = wtb;
        this.d = wmd;
        this.e = wml;
        int a2 = kr.a(context, "android.permission.READ_CONTACTS", clientContext.j, clientContext.b, clientContext.e);
        ClientContext clientContext2 = this.a;
        int a3 = kr.a(context, "android.permission.GET_ACCOUNTS", clientContext2.j, clientContext2.b, clientContext2.e);
        if (a2 == -1 || a3 == -1) {
            throw new SecurityException("Missing required permissions. READ_CONTACTS and GET_ACCOUNTS are required.");
        }
        int i = -2;
        if (!(a2 == -2 || a3 == -2)) {
            i = 0;
        }
        this.g = i;
        this.f = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        char c2;
        ClassifyAccountTypeResult classifyAccountTypeResult;
        int a2 = yby.a(this.a.e, this.f);
        aucd o = xld.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xld xld = (xld) o.b;
        xld.b = 7;
        int i = xld.a | 1;
        xld.a = i;
        int i2 = a2 - 1;
        if (a2 != 0) {
            xld.d = i2;
            xld.a = i | 4;
            if (ayql.a.a().c() && this.g == 0 && ayql.a.a().b().a.contains(this.a.e)) {
                try {
                    wmd wmd = this.d;
                    wlz b2 = ayql.b();
                    aucd aucd = (aucd) b2.c(5);
                    aucd.a((aucj) b2);
                    aucd.a((aucj) wmd.a());
                    wmh wmh = new wmh((wlz) aucd.i());
                    ArrayList arrayList = new ArrayList(this.b.size());
                    for (ClassifyAccountTypeRequest classifyAccountTypeRequest : this.b) {
                        if (TextUtils.isEmpty(classifyAccountTypeRequest.a)) {
                            classifyAccountTypeResult = wmh.a((String) null, classifyAccountTypeRequest.b);
                        } else {
                            classifyAccountTypeResult = wmh.a(classifyAccountTypeRequest.a, classifyAccountTypeRequest.b);
                        }
                        arrayList.add(classifyAccountTypeResult);
                    }
                    this.c.a(Status.a, (List) arrayList);
                    c2 = 0;
                } catch (IOException e2) {
                    this.c.a(Status.c, (List) amzy.h());
                    c2 = 8;
                }
            } else {
                this.c.a(new Status(16), (List) amzy.h());
                c2 = 16;
            }
            if (c2 != 16) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xld xld2 = (xld) o.b;
                xld2.c = 0;
                xld2.a |= 2;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xld xld3 = (xld) o.b;
                xld3.c = 4;
                xld3.a |= 2;
            }
            this.e.a((xld) o.i());
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.c.a(status, (List) amzy.h());
    }
}
