package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: obq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obq extends LinearLayout implements obm {
    private final List a;

    public obq(Context context, obg obg, avnj avnj) {
        super(context);
        setTag(avnj.b);
        setOrientation(1);
        this.a = new ArrayList(avnj.f.size());
        aucx aucx = avnj.f;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            obp obp = new obp(context, obg, (avnl) aucx.get(i));
            this.a.add(obp);
            obg.a(obp);
            addView(obp);
            if (obp.c()) {
                addView(obp.a);
            }
        }
    }

    public final List aY() {
        ArrayList arrayList = new ArrayList();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            obp obp = (obp) list.get(i);
            if (obp.b) {
                arrayList.add(obp);
            }
        }
        return arrayList;
    }

    public final List c() {
        boolean z;
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        String str2 = (String) getTag();
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i2 >= size) {
                z = false;
                break;
            } else if (((obp) list.get(i2)).isChecked() && (i3 = i3 + 1) > 1) {
                break;
            } else {
                i2++;
            }
        }
        List list2 = this.a;
        int size2 = list2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            obp obp = (obp) list2.get(i5);
            if (obp.isChecked()) {
                String str3 = (String) obp.getTag();
                if (z) {
                    i = i4 + 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append("_");
                    sb.append(i4);
                    str = sb.toString();
                } else {
                    i = i4;
                    str = str2;
                }
                arrayList.add(oaq.a(str, str3));
                if (obp.c()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length());
                    sb2.append(str2);
                    sb2.append("--");
                    sb2.append(str3);
                    arrayList.add(oaq.a(sb2.toString(), obp.a.getText().toString()));
                }
                i4 = i;
            }
        }
        return arrayList;
    }
}
