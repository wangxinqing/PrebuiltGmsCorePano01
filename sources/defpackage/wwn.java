package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: wwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwn {
    private static final String[] j = {"android.provider.ALTERNATE_CONTACTS_STRUCTURE", "android.provider.CONTACTS_STRUCTURE"};
    public String a = null;
    public String b = null;
    public String c;
    public int d = -1;
    public int e = -1;
    public HashMap f = new HashMap();
    public boolean g;
    public List h;
    public boolean i;
    private ArrayList k = new ArrayList();
    private String l;
    private String m;
    private String n;
    private String o;

    static int a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.charAt(0) != '@') {
            Log.e("ExAccountType", str3.concat(" must be a resource name beginning with '@'"));
            return -1;
        }
        try {
            int identifier = context.getPackageManager().getResourcesForApplication(str2).getIdentifier(str.substring(1), (String) null, str2);
            if (identifier != 0) {
                return identifier;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(str2).length());
            sb.append("Unable to load ");
            sb.append(str);
            sb.append(" from package ");
            sb.append(str2);
            Log.e("ExAccountType", sb.toString());
            return -1;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(str2);
            Log.e("ExAccountType", valueOf.length() == 0 ? new String("Unable to load package ") : "Unable to load package ".concat(valueOf));
            return -1;
        }
    }

    public wwn(Context context, String str) {
        XmlResourceParser xmlResourceParser = null;
        this.c = str;
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.content.SyncAdapter").setPackage(str), 132);
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    for (String loadXmlMetaData : j) {
                        XmlResourceParser loadXmlMetaData2 = serviceInfo.loadXmlMetaData(packageManager, loadXmlMetaData);
                        if (loadXmlMetaData2 != null) {
                            xmlResourceParser = loadXmlMetaData2;
                            break loop0;
                        }
                    }
                    continue;
                }
            }
        }
        if (xmlResourceParser != null) {
            try {
                a(context, xmlResourceParser);
            } catch (wwm e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Problem reading XML");
                if (xmlResourceParser != null) {
                    sb.append(" in line ");
                    sb.append(xmlResourceParser.getLineNumber());
                }
                sb.append(" for external package ");
                sb.append(str);
                Log.e("ExAccountType", sb.toString(), e2);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        }
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
        }
        this.h = new ArrayList();
        a(context, this.l, str, "inviteContactActionLabel");
        a(context, this.m, str, "viewGroupActionLabel");
        this.d = a(context, this.n, str, "accountTypeLabel");
        this.e = a(context, this.o, str, "accountTypeIcon");
        this.g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r1 = new java.lang.String("Top level element must be ContactsAccountType, not ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r1 = "Top level element must be ContactsAccountType, not ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r11.i = true;
        r2 = r13.getAttributeCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6 >= r2) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r13.getAttributeName(r6);
        r9 = r13.getAttributeValue(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if ("editContactActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if ("createContactActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if ("inviteContactActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if ("inviteContactActionLabel".equals(r8) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if ("viewContactNotifyService".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if ("viewGroupActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if ("viewGroupActionLabel".equals(r8) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if ("viewStreamItemActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if ("viewStreamItemPhotoActivity".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if ("dataSet".equals(r8) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if ("extensionPackageNames".equals(r8) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if ("accountType".equals(r8) != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if ("accountTypeLabel".equals(r8) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if ("accountTypeIcon".equals(r8) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        if ("readOnly".equals(r8) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        r8 = java.lang.String.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r13.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        if (r8.length() != 0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        r8 = new java.lang.String("Unsupported attribute ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        r8 = "Unsupported attribute ".concat(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        android.util.Log.e("ExAccountType", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        r11.o = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e7, code lost:
        r11.n = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        r11.a = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        r11.h.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        r11.b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        r11.m = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ("ContactsAccountType".equals(r2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f9, code lost:
        r11.l = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fb, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
        r2 = r13.getDepth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        r6 = r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        if (r6 != 3) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        if (r13.getDepth() <= r2) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0110, code lost:
        if (r6 == 1) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        if (r6 != 2) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011a, code lost:
        if (r13.getDepth() != (r2 + 1)) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0126, code lost:
        if ("ContactsDataKind".equals(r13.getName()) == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        r6 = r12.obtainStyledAttributes(r1, new int[]{16842790, 16843426, 16843427});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        if (r6 != null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013f, code lost:
        android.util.Log.e("ExAccountType", "Failed to obtain ContactsDataKind styled attributes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0145, code lost:
        r8 = r6.getString(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        if (r8 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014c, code lost:
        r9 = new defpackage.wwp();
        r9.b = r8;
        r8 = r6.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0157, code lost:
        if (r8 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ("ContactsSource".equals(r2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015a, code lost:
        r9.c = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015c, code lost:
        r8 = r6.getString(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        if (r8 != null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0164, code lost:
        r9.d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0166, code lost:
        r6.recycle();
        r6 = r9.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016b, code lost:
        if (r6 == null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0173, code lost:
        if (r11.f.get(r6) != null) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0175, code lost:
        r9.a = r11.c;
        r11.k.add(r9);
        r11.f.put(r9.b, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0187, code lost:
        r13 = r9.b;
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 34);
        r2.append("mime type '");
        r2.append(r13);
        r2.append("' is already registered");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ae, code lost:
        throw new defpackage.wwm(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        throw new defpackage.wwm("null is not a valid mime type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b7, code lost:
        android.util.Log.e("ExAccountType", "Failed to obtain mimeType from ContactsDataKind styled attributes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1.length() != 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Problem reading XML"
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r13)
        L_0x0006:
            int r2 = r13.next()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r3 = 2
            r4 = 1
            if (r2 != r3) goto L_0x01bf
            java.lang.String r2 = r13.getName()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r5 = "ContactsAccountType"
            boolean r5 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r5 != 0) goto L_0x003e
            java.lang.String r5 = "ContactsSource"
            boolean r5 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r5 != 0) goto L_0x003e
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r13 = "Top level element must be ContactsAccountType, not "
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            int r2 = r1.length()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r2 != 0) goto L_0x0036
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r1.<init>(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x003a
        L_0x0036:
            java.lang.String r1 = r13.concat(r1)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x003a:
            r12.<init>(r1)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            throw r12     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x003e:
            r11.i = r4     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            int r2 = r13.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r5 = 0
            r6 = 0
        L_0x0046:
            java.lang.String r7 = "ExAccountType"
            if (r6 >= r2) goto L_0x00ff
            java.lang.String r8 = r13.getAttributeName(r6)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r9 = r13.getAttributeValue(r6)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r10 = "editContactActivity"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "createContactActivity"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "inviteContactActivity"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "inviteContactActionLabel"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00f9
            java.lang.String r10 = "viewContactNotifyService"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "viewGroupActivity"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "viewGroupActionLabel"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00f6
            java.lang.String r10 = "viewStreamItemActivity"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "viewStreamItemPhotoActivity"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00fb
            java.lang.String r10 = "dataSet"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00f3
            java.lang.String r10 = "extensionPackageNames"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00ed
            java.lang.String r10 = "accountType"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00ea
            java.lang.String r10 = "accountTypeLabel"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00e7
            java.lang.String r10 = "accountTypeIcon"
            boolean r10 = r10.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00e4
            java.lang.String r9 = "readOnly"
            boolean r9 = r9.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r9 != 0) goto L_0x00fb
            java.lang.String r9 = "Unsupported attribute "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            int r10 = r8.length()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r10 != 0) goto L_0x00dc
            java.lang.String r8 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r8.<init>(r9)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00e0
        L_0x00dc:
            java.lang.String r8 = r9.concat(r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x00e0:
            android.util.Log.e(r7, r8)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00e4:
            r11.o = r9     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00e7:
            r11.n = r9     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00ea:
            r11.a = r9     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00ed:
            java.util.List r7 = r11.h     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r7.add(r9)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00f3:
            r11.b = r9     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00f6:
            r11.m = r9     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x00fb
        L_0x00f9:
            r11.l = r9     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x00fb:
            int r6 = r6 + 1
            goto L_0x0046
        L_0x00ff:
            int r2 = r13.getDepth()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x0103:
            int r6 = r13.next()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r8 = 3
            if (r6 != r8) goto L_0x0110
            int r9 = r13.getDepth()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r9 <= r2) goto L_0x01be
        L_0x0110:
            if (r6 == r4) goto L_0x01be
            if (r6 != r3) goto L_0x0103
            int r6 = r13.getDepth()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            int r9 = r2 + 1
            if (r6 != r9) goto L_0x0103
            java.lang.String r6 = "ContactsDataKind"
            java.lang.String r9 = r13.getName()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            boolean r6 = r6.equals(r9)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r6 == 0) goto L_0x0103
            int[] r6 = new int[r8]     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r8 = 16842790(0x1010026, float:2.3693665E-38)
            r6[r5] = r8     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r8 = 16843426(0x10102a2, float:2.3695447E-38)
            r6[r4] = r8     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r8 = 16843427(0x10102a3, float:2.369545E-38)
            r6[r3] = r8     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r1, r6)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r6 != 0) goto L_0x0145
            java.lang.String r6 = "Failed to obtain ContactsDataKind styled attributes"
            android.util.Log.e(r7, r6)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x0103
        L_0x0145:
            java.lang.String r8 = r6.getString(r5)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r8 == 0) goto L_0x01b7
            wwp r9 = new wwp     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r9.b = r8     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r8 = r6.getString(r4)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r8 != 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r9.c = r8     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x015c:
            java.lang.String r8 = r6.getString(r3)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r8 != 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r9.d = r8     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x0166:
            r6.recycle()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r6 = r9.b     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r6 == 0) goto L_0x01af
            java.util.HashMap r8 = r11.f     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.Object r6 = r8.get(r6)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            if (r6 != 0) goto L_0x0187
            java.lang.String r6 = r11.c     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r9.a = r6     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.util.ArrayList r6 = r11.k     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r6.add(r9)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.util.HashMap r6 = r11.f     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r8 = r9.b     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r6.put(r8, r9)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x0103
        L_0x0187:
            wwm r12 = new wwm     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r13 = r9.b     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            int r1 = r1.length()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            int r1 = r1 + 34
            r2.<init>(r1)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r1 = "mime type '"
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r13 = "' is already registered"
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            throw r12     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x01af:
            wwm r12 = new wwm     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r13 = "null is not a valid mime type"
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            throw r12     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x01b7:
            java.lang.String r6 = "Failed to obtain mimeType from ContactsDataKind styled attributes"
            android.util.Log.e(r7, r6)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            goto L_0x0103
        L_0x01be:
            return
        L_0x01bf:
            if (r2 == r4) goto L_0x01c3
            goto L_0x0006
        L_0x01c3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            java.lang.String r13 = "No start tag found"
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
            throw r12     // Catch:{ XmlPullParserException -> 0x01d2, IOException -> 0x01cb }
        L_0x01cb:
            r12 = move-exception
            wwm r13 = new wwm
            r13.<init>(r0, r12)
            throw r13
        L_0x01d2:
            r12 = move-exception
            wwm r13 = new wwm
            r13.<init>(r0, r12)
            goto L_0x01da
        L_0x01d9:
            throw r13
        L_0x01da:
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwn.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
