package defpackage;

import android.text.Editable;
import android.text.Html;
import com.google.android.gms.family.common.HelpLinkSpan;
import com.google.android.gms.family.v2.model.HelpData;
import com.google.android.gms.family.v2.model.PageData;
import org.xml.sax.XMLReader;

/* renamed from: mgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgb implements Html.TagHandler {
    private final PageData a;
    private final mfz b;
    private final String c;

    public mgb(PageData pageData, mfz mfz, String str) {
        this.a = pageData;
        this.b = mfz;
        this.c = str;
    }

    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (str.startsWith("help-")) {
            String substring = str.substring(5);
            if (this.a.b.containsKey(substring)) {
                String str2 = ((HelpData) this.a.b.get(substring)).b;
                String str3 = ((HelpData) this.a.b.get(substring)).a;
                if (!jlh.d(str2) && !jlh.d(str3)) {
                    int length = editable.length();
                    if (!z) {
                        mga[] mgaArr = (mga[]) editable.getSpans(0, length, mga.class);
                        int length2 = mgaArr.length;
                        if (length2 != 0) {
                            mga mga = mgaArr[length2 - 1];
                            int spanStart = editable.getSpanStart(mga);
                            editable.removeSpan(mga);
                            if (spanStart != length) {
                                editable.setSpan(new HelpLinkSpan(this.b, str2, str3, this.c), spanStart, length, 33);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    editable.setSpan(new mga(), length, length, 17);
                }
            }
        }
    }
}
