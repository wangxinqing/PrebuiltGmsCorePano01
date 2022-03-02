package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: lqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lqx extends lql {
    private final Collator b;

    public lqx(String str) {
        super(str, R.string.drive_document_title, true);
        Collator instance = Collator.getInstance(Locale.getDefault());
        this.b = instance;
        instance.setStrength(0);
    }

    public final lqr a(jzt jzt, Context context) {
        int a = a(jzt);
        int a2 = jzt.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new lqp(context.getString(R.string.drive_fast_scroll_title_grouper_collections), a));
        arrayList.add(new lqp(context.getString(R.string.drive_title_grouper_files), a2 - a));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new lqp(context.getString(R.string.drive_fast_scroll_title_grouper_collections), a));
        String valueOf = String.valueOf(context.getString(R.string.drive_alphabet_set));
        String str = valueOf.length() == 0 ? new String(" ") : " ".concat(valueOf);
        ArrayList arrayList3 = new ArrayList(str.length());
        int i = 0;
        while (i < str.length()) {
            int offsetByCodePoints = str.offsetByCodePoints(i, 1);
            arrayList3.add(str.substring(i, offsetByCodePoints));
            i = offsetByCodePoints;
        }
        Collections.sort(arrayList3, this.b);
        Iterator it = arrayList3.iterator();
        String str2 = (String) it.next();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            int a3 = jzt.a();
            int i2 = a;
            while (a3 > i2) {
                int i3 = (a3 + i2) / 2;
                if (this.b.compare(jzt.a(i3).d(), str3) < 0) {
                    i2 = i3 + 1;
                } else {
                    a3 = i3;
                }
            }
            arrayList2.add(new lqp(str2, i2 - a));
            str2 = str3;
            a = i2;
        }
        arrayList2.add(new lqp(str2, a2 - a));
        return new lqr(arrayList, arrayList2, jzt);
    }

    public final lqw a(Context context) {
        return lqv.a.a(context);
    }

    /* access modifiers changed from: protected */
    public final void a(liw liw) {
        liw.a.add(new FieldWithSortOrder(((kyl) liy.a).a, true));
    }
}
