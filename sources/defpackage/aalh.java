package defpackage;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: aalh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aalh extends aafb {
    private final osf a;

    public aalh(osf osf, GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ozc ozc) {
        super(aonk.GET_PHRASE_AFFINITY, 1, 2, osf.b, getPhraseAffinityCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        PhraseAffinityResponse phraseAffinityResponse;
        int i;
        Map map;
        GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = (GetPhraseAffinityCall$Request) this.n;
        String[] strArr = getPhraseAffinityCall$Request.a;
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = getPhraseAffinityCall$Request.b;
        boolean z = false;
        if (strArr == null || phraseAffinityCorpusSpecArr == null) {
            str = "Null phrases or specs";
        } else {
            try {
                int length = strArr.length;
                if (length <= 100) {
                    int length2 = phraseAffinityCorpusSpecArr.length;
                    if (length2 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                str = null;
                                break;
                            }
                            Map a2 = phraseAffinityCorpusSpecArr[i2].a();
                            if (a2.isEmpty()) {
                                str = "Empty section weights";
                                break;
                            }
                            for (Map.Entry entry : a2.entrySet()) {
                                osn.a((String) entry.getKey());
                                osn.a(((Integer) entry.getValue()).intValue());
                            }
                            i2++;
                        }
                    } else {
                        str = "No corpora names";
                    }
                } else {
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("Bad num phrases: ");
                    sb.append(length);
                    str = sb.toString();
                }
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        if (str == null) {
            PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr2 = ((GetPhraseAffinityCall$Request) this.n).b;
            aucd o = otx.d.o();
            List asList = Arrays.asList(((GetPhraseAffinityCall$Request) this.n).a);
            if (o.c) {
                o.c();
                o.c = false;
            }
            otx otx = (otx) o.b;
            if (!otx.c.a()) {
                otx.c = aucj.a(otx.c);
            }
            auab.a((Iterable) asList, (List) otx.c);
            aucd o2 = oul.v.o();
            ozs a3 = this.a.a();
            synchronized (a3.a()) {
                int i3 = 0;
                while (true) {
                    int length3 = phraseAffinityCorpusSpecArr2.length;
                    if (i3 < length3) {
                        PhraseAffinityCorpusSpec phraseAffinityCorpusSpec = phraseAffinityCorpusSpecArr2[i3];
                        CorpusId corpusId = phraseAffinityCorpusSpec.a;
                        Map a4 = phraseAffinityCorpusSpec.a();
                        int i4 = 1;
                        for (Integer intValue : a4.values()) {
                            i4 = Math.max(i4, intValue.intValue());
                        }
                        if (!this.a.m.e(corpusId.a)) {
                            String valueOf = String.valueOf(corpusId.a);
                            phraseAffinityResponse = dtu.c(valueOf.length() == 0 ? new String("Package name non-existent or not globally searchable ") : "Package name non-existent or not globally searchable ".concat(valueOf));
                        } else {
                            osz d = a3.d(new pao(corpusId.a, corpusId.b));
                            if (d != null) {
                                int i5 = 0;
                                boolean z2 = false;
                                while (i5 < d.j.size()) {
                                    Integer num = (Integer) a4.get(((oqy) d.j.get(i5)).b);
                                    if (num == null) {
                                        map = a4;
                                    } else {
                                        aucd o3 = ouk.e.o();
                                        int i6 = d.b;
                                        if (o3.c) {
                                            o3.c();
                                            o3.c = z;
                                        }
                                        ouk ouk = (ouk) o3.b;
                                        int i7 = ouk.a | 1;
                                        ouk.a = i7;
                                        ouk.b = i6;
                                        ouk.a = i7 | 2;
                                        ouk.c = i5;
                                        double intValue2 = (double) num.intValue();
                                        map = a4;
                                        double d2 = (double) i4;
                                        Double.isNaN(intValue2);
                                        Double.isNaN(d2);
                                        double d3 = intValue2 / d2;
                                        if (o3.c) {
                                            o3.c();
                                            o3.c = false;
                                        }
                                        ouk ouk2 = (ouk) o3.b;
                                        ouk2.a |= 4;
                                        ouk2.d = d3;
                                        o2.a((ouk) o3.i());
                                        z2 = true;
                                    }
                                    i5++;
                                    a4 = map;
                                    z = false;
                                }
                                if (!z2) {
                                    aucd o4 = ouk.e.o();
                                    int i8 = d.b;
                                    if (o4.c) {
                                        o4.c();
                                        o4.c = false;
                                    }
                                    ouk ouk3 = (ouk) o4.b;
                                    ouk3.a |= 1;
                                    ouk3.b = i8;
                                    o2.a((ouk) o4.i());
                                }
                            }
                            i3++;
                            z = false;
                        }
                    } else {
                        if (!o.c) {
                            i = 0;
                        } else {
                            o.c();
                            i = 0;
                            o.c = false;
                        }
                        otx otx2 = (otx) o.b;
                        oul oul = (oul) o2.i();
                        oul.getClass();
                        otx2.b = oul;
                        otx2.a |= 1;
                        int[] nativeGetPhraseAffinityScores = NativeIndex.nativeGetPhraseAffinityScores(this.a.n.b, ((otx) o.i()).k());
                        CorpusId[] corpusIdArr = new CorpusId[length3];
                        while (i < phraseAffinityCorpusSpecArr2.length) {
                            corpusIdArr[i] = phraseAffinityCorpusSpecArr2[i].a;
                            i++;
                        }
                        phraseAffinityResponse = new PhraseAffinityResponse(corpusIdArr, nativeGetPhraseAffinityScores);
                    }
                }
            }
        } else {
            phraseAffinityResponse = dtu.c(str);
        }
        GetPhraseAffinityCall$Response getPhraseAffinityCall$Response = new GetPhraseAffinityCall$Response();
        getPhraseAffinityCall$Response.b = phraseAffinityResponse;
        String str2 = phraseAffinityResponse.a;
        getPhraseAffinityCall$Response.a = str2 != null ? new Status(8, str2, (PendingIntent) null) : Status.a;
        return getPhraseAffinityCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        String str;
        String[] strArr = ((GetPhraseAffinityCall$Request) this.n).a;
        if (strArr != null) {
            str = TextUtils.join(",", strArr);
        } else {
            str = "";
        }
        return String.format("%s, phrases[%s]", new Object[]{super.f(), str});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GetPhraseAffinityCall$Response getPhraseAffinityCall$Response = new GetPhraseAffinityCall$Response();
        getPhraseAffinityCall$Response.a = status;
        return getPhraseAffinityCall$Response;
    }
}
