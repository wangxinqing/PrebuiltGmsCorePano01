package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: wuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wuz implements wuk {
    private final String a;

    public wuz(String str) {
        this.a = str;
    }

    public final String a() {
        String str = this.a;
        return str.length() == 0 ? new String("phenotype_") : "phenotype_".concat(str);
    }

    public final void b() {
    }

    public final /* bridge */ /* synthetic */ wuj a(icc icc) {
        yey a2 = yef.a(((iey) icc).d);
        try {
            ArrayList arrayList = new ArrayList();
            for (Configuration configuration : ((Configurations) acws.a(a2.i(this.a))).d) {
                for (Flag flag : configuration.b) {
                    String str = flag.a;
                    String f = flag.f();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(f).length());
                    sb.append(str);
                    sb.append("=");
                    sb.append(f);
                    arrayList.add(sb.toString());
                }
            }
            return new wuy(a(), arrayList);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
