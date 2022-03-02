package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ParagraphStyle;
import java.io.IOException;
import java.io.StringReader;
import org.ccil.cowan.tagsoup.Parser;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* renamed from: adfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adfs implements ContentHandler {
    private final String a;
    private final XMLReader b;
    private final SpannableStringBuilder c = new SpannableStringBuilder();
    private final adgw d;

    public adfs(String str, Parser parser, adgw adgw) {
        this.a = str;
        this.b = parser;
        this.d = adgw;
    }

    private static Object a(Spanned spanned, Class cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        int length = spans.length;
        if (length != 0) {
            return spans[length - 1];
        }
        return null;
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, Object obj) {
        a((Editable) spannableStringBuilder);
        a(spannableStringBuilder, obj);
    }

    public final void characters(char[] cArr, int i, int i2) {
        char c2;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            char c3 = cArr[i3 + i];
            if (c3 == ' ' || c3 == 10) {
                int length = sb.length();
                if (length == 0) {
                    int length2 = this.c.length();
                    if (length2 != 0) {
                        c2 = this.c.charAt(length2 - 1);
                    } else {
                        c2 = 10;
                    }
                } else {
                    c2 = sb.charAt(length - 1);
                }
                if (!(c2 == ' ' || c2 == 10)) {
                    sb.append(' ');
                }
            } else {
                sb.append(c3);
            }
        }
        this.c.append(sb);
    }

    public final void endDocument() {
    }

    public final void endPrefixMapping(String str) {
    }

    public final void ignorableWhitespace(char[] cArr, int i, int i2) {
    }

    public final void processingInstruction(String str, String str2) {
    }

    public final void setDocumentLocator(Locator locator) {
    }

    public final void skippedEntity(String str) {
    }

    public final void startDocument() {
    }

    public final void startPrefixMapping(String str, String str2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        r2 = (defpackage.adfo) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void endElement(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r10 = "br"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x00d9
            java.lang.String r10 = "p"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0016
            android.text.SpannableStringBuilder r10 = r9.c
            a((android.text.SpannableStringBuilder) r10)
            return
        L_0x0016:
            java.lang.String r10 = "b"
            boolean r10 = r11.equalsIgnoreCase(r10)
            r12 = 1
            if (r10 == 0) goto L_0x002d
            android.text.SpannableStringBuilder r10 = r9.c
            android.text.style.StyleSpan r11 = new android.text.style.StyleSpan
            r11.<init>(r12)
            java.lang.Class<adfn> r12 = defpackage.adfn.class
            a(r10, r12, r11)
            return
        L_0x002d:
            java.lang.String r10 = "i"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0044
            android.text.SpannableStringBuilder r10 = r9.c
            android.text.style.StyleSpan r11 = new android.text.style.StyleSpan
            r12 = 2
            r11.<init>(r12)
            java.lang.Class<adfp> r12 = defpackage.adfp.class
            a(r10, r12, r11)
            return
        L_0x0044:
            java.lang.String r10 = "a"
            boolean r10 = r11.equalsIgnoreCase(r10)
            r0 = 33
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = "ul"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x0089
            java.lang.String r10 = "li"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x00d8
            android.text.SpannableStringBuilder r10 = r9.c
            a((android.text.Editable) r10)
            int r11 = r10.length()
            java.lang.Class<adfq> r12 = defpackage.adfq.class
            java.lang.Object r12 = a((android.text.Spanned) r10, (java.lang.Class) r12)
            int r1 = r10.getSpanStart(r12)
            r10.removeSpan(r12)
            if (r1 == r11) goto L_0x00d8
            android.text.style.LeadingMarginSpan$Standard r12 = new android.text.style.LeadingMarginSpan$Standard
            r2 = 5
            r12.<init>(r2)
            r10.setSpan(r12, r1, r11, r0)
            adga r12 = new adga
            r12.<init>()
            r10.setSpan(r12, r1, r11, r0)
            return
        L_0x0089:
            android.text.SpannableStringBuilder r10 = r9.c
            a((android.text.Editable) r10)
            adfi r11 = new adfi
            r11.<init>()
            java.lang.Class<adfr> r12 = defpackage.adfr.class
            a(r10, r12, r11)
            return
        L_0x0099:
            android.text.SpannableStringBuilder r10 = r9.c
            adgw r11 = r9.d
            int r1 = r10.length()
            java.lang.Class<adfo> r2 = defpackage.adfo.class
            java.lang.Object r2 = a((android.text.Spanned) r10, (java.lang.Class) r2)
            int r3 = r10.getSpanStart(r2)
            r10.removeSpan(r2)
            if (r3 == r1) goto L_0x00d8
            adfo r2 = (defpackage.adfo) r2
            java.lang.String r4 = r2.a
            if (r4 == 0) goto L_0x00d8
            com.google.android.gms.udc.ui.UdcAuthUrlSpan r5 = new com.google.android.gms.udc.ui.UdcAuthUrlSpan
            java.lang.String r6 = r2.b
            java.lang.String r7 = r2.c
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            if (r7 != 0) goto L_0x00d0
            java.lang.String r2 = r2.c
            java.lang.String r7 = "yes"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 != 0) goto L_0x00cf
            r12 = 0
            goto L_0x00d1
        L_0x00cf:
            goto L_0x00d1
        L_0x00d0:
            r12 = 0
        L_0x00d1:
            r5.<init>(r4, r6, r12, r11)
            r10.setSpan(r5, r3, r1, r0)
            return
        L_0x00d8:
            return
        L_0x00d9:
            android.text.SpannableStringBuilder r10 = r9.c
            java.lang.String r11 = "\n"
            r10.append(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfs.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2.equalsIgnoreCase("br")) {
            return;
        }
        if (str2.equalsIgnoreCase("p")) {
            a(this.c);
        } else if (str2.equalsIgnoreCase("b")) {
            a(this.c, (Object) new adfn());
        } else if (str2.equalsIgnoreCase("i")) {
            a(this.c, (Object) new adfp());
        } else if (str2.equalsIgnoreCase("a")) {
            SpannableStringBuilder spannableStringBuilder = this.c;
            String value = attributes.getValue("", "href");
            String value2 = attributes.getValue("", "data-auth");
            if (TextUtils.isEmpty(value2)) {
                value2 = attributes.getValue("", "auth");
            }
            String value3 = attributes.getValue("", "data-avref");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new adfo(value, value3, value2), length, length, 17);
        } else if (str2.equalsIgnoreCase("ul")) {
            b(this.c, new adfr());
        } else if (str2.equalsIgnoreCase("li")) {
            b(this.c, new adfq());
        }
    }

    private static void a(Editable editable) {
        if (!TextUtils.isEmpty(editable) && editable.charAt(editable.length() - 1) != 10) {
            editable.append("\n");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        if (length <= 0 || spannableStringBuilder.charAt(length - 1) != 10) {
            if (length != 0) {
                spannableStringBuilder.append("\n\n");
            }
        } else if (length < 2 || spannableStringBuilder.charAt(length - 2) != 10) {
            spannableStringBuilder.append("\n");
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Class cls, Object obj) {
        int length = spannableStringBuilder.length();
        Object a2 = a((Spanned) spannableStringBuilder, cls);
        int spanStart = spannableStringBuilder.getSpanStart(a2);
        spannableStringBuilder.removeSpan(a2);
        if (spanStart != length) {
            spannableStringBuilder.setSpan(obj, spanStart, length, 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length, length, 17);
    }

    public final Spanned a() {
        this.b.setContentHandler(this);
        try {
            this.b.parse(new InputSource(new StringReader(this.a)));
            SpannableStringBuilder spannableStringBuilder = this.c;
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ParagraphStyle.class);
            for (int i = 0; i < spans.length; i++) {
                int spanStart = this.c.getSpanStart(spans[i]);
                int spanEnd = this.c.getSpanEnd(spans[i]);
                int i2 = spanEnd - 2;
                if (i2 >= 0) {
                    int i3 = spanEnd - 1;
                    if (this.c.charAt(i3) == 10 && this.c.charAt(i2) == 10) {
                        spanEnd = i3;
                    }
                }
                if (spanEnd != spanStart) {
                    this.c.setSpan(spans[i], spanStart, spanEnd, 51);
                } else {
                    this.c.removeSpan(spans[i]);
                }
            }
            return this.c;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e2) {
            throw new RuntimeException(e2);
        }
    }
}
