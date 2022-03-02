package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.drive.internal.model.ChangeList;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileList;
import com.google.android.gms.drive.internal.model.FileLocalId;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnn {
    public static final ith a = new ith("ApiaryRemoteResourceAcc", "");
    public static final String b = String.format("mimeType = '%s'", new Object[]{"application/vnd.google-apps.folder"});
    public static final String c = String.format("mimeType != '%s'", new Object[]{"application/vnd.google-apps.folder"});
    private static final Map d = new ConcurrentHashMap();
    private static final anax e = anax.a("authorizedAppIds", "creatorAppId", "subscribed", "gplusMedia", "folderFeatures", "spaces", "recency", "recencyReason", "appId");
    private static final anax f = anax.a((Object) FileList.class, (Object) ChangeList.class);
    private lns g;
    private lns h;
    private final Context i;

    static {
        iva.a((Object) "application/vnd.google-apps.folder");
        iva.a((Object) "application/vnd.google-apps.folder");
    }

    public lnn(Context context) {
        this.i = context;
    }

    public static FileLocalId a(String str, boolean z) {
        String str2;
        FileLocalId fileLocalId = new FileLocalId();
        fileLocalId.c = str;
        fileLocalId.a.add(4);
        if (!z) {
            str2 = "DRIVE";
        } else {
            str2 = "APPDATA";
        }
        fileLocalId.b = str2;
        fileLocalId.a.add(3);
        String str3 = (String) jzq.aA.c();
        if (!TextUtils.isEmpty(str3)) {
            fileLocalId.d = str3;
            fileLocalId.a.add(5);
        }
        return fileLocalId;
    }

    public static boolean a(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        return networkResponse != null && networkResponse.statusCode == 404;
    }

    private static String b(Class cls, boolean z, boolean z2) {
        lnm lnm = new lnm(cls, z, z2);
        String str = (String) d.get(lnm);
        if (str != null) {
            return str;
        }
        String a2 = a(cls, z, z2);
        d.put(lnm, a2);
        return a2;
    }

    public static String a(Class cls, boolean z) {
        return b(cls, z, f.contains(cls));
    }

    private static String a(Class cls, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : ((jag) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).a().entrySet()) {
                if (z || !e.contains(entry.getKey())) {
                    if (z2 || !((Boolean) jzq.R.c()).booleanValue()) {
                        if ("permissions".equals(entry.getKey())) {
                        }
                    }
                    if (((Boolean) jzq.N.c()).booleanValue() || !"folderColorRgb".equals(entry.getKey())) {
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append((String) entry.getKey());
                        Class cls2 = ((FastJsonResponse$Field) entry.getValue()).h;
                        if (cls2 != null) {
                            String b2 = b(cls2, z, z2);
                            if (b2.length() != 0) {
                                sb.append("(");
                                sb.append(b2);
                                sb.append(")");
                            }
                        }
                    }
                }
            }
        } catch (NoSuchMethodException e2) {
            a.c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", new Object[]{cls}), e2);
        } catch (InstantiationException e3) {
            a.c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", new Object[]{cls}), e3);
        } catch (IllegalAccessException e4) {
            a.c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", new Object[]{cls}), e4);
        } catch (InvocationTargetException e5) {
            a.c("ApiaryRemoteResourceAcc", String.format("Unable to create instance: %s", new Object[]{cls}), e5);
        }
        return sb.toString();
    }

    private static lns a(Context context, String str, int i2) {
        String a2 = lnp.a();
        lns lns = new lns(context, (String) jzq.K.c(), str, ((Boolean) jzq.bd.c()).booleanValue(), a2, i2);
        if (a2 != null && ((Boolean) jzq.L.c()).booleanValue()) {
            lns.f.put("trace.deb", "genoa:3:all,driveService:3:all,cospel:3:all,DriveService:3:all");
        }
        return lns;
    }

    public static boolean a(ClientContext clientContext) {
        return "com.google.android.gms".equals(clientContext.f);
    }

    public final String a(ClientContext clientContext, String str, boolean z) {
        File file = new File();
        file.a(a(str, z));
        lnv lnv = new lnv(a(clientContext, 2839));
        iyu iyu = new iyu();
        iyu.a("id");
        try {
            StringBuilder sb = new StringBuilder("files/generateId");
            iyu.a(sb);
            return ((File) lnv.a.a(clientContext, 1, sb.toString(), (Object) file, File.class)).t;
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    public final String a(Set set) {
        iva.a((Object) set);
        if (!set.isEmpty()) {
            return TextUtils.join(",", set.toArray());
        }
        return null;
    }

    public final String a(khq khq) {
        ClientContext a2 = khq.a(this.i);
        lnv lnv = new lnv(a(a2, 2822));
        try {
            iyu iyu = new iyu();
            iyu.a("id");
            return lnv.a(a2, "appdata", (Boolean) null, true, (Boolean) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (Integer) null, false, iyu).t;
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    public final lnj a(ClientContext clientContext, File file) {
        lnv lnv = new lnv(a(clientContext, 2829));
        iyu iyu = new iyu();
        iyu.a(a(File.class, a(clientContext)));
        StringBuilder sb = new StringBuilder("files");
        iyu.a(sb);
        iyv.a(sb, "convert", String.valueOf(false));
        iyv.a(sb, "ocr", String.valueOf(false));
        iyv.a(sb, "pinned", String.valueOf(false));
        iyv.a(sb, "useContentAsIndexableText", String.valueOf(false));
        return new lnl((File) lnv.a.a(clientContext, 1, sb.toString(), (Object) file, File.class), clientContext, (String) null);
    }

    public final lnj a(ClientContext clientContext, String str, MetadataBundle metadataBundle) {
        ClientContext clientContext2 = clientContext;
        lnv lnv = new lnv(a(clientContext2, 2837));
        try {
            iyu iyu = new iyu();
            iyu.a(a(File.class, a(clientContext)));
            return new lnl(lnv.a(clientContext, str, (Boolean) null, (Boolean) null, "SET_FROM_BODY", (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, 1, (Integer) null, (Boolean) null, false, lbb.a(metadataBundle), iyu), clientContext2, (String) null);
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    public final lnj a(ClientContext clientContext, String str, Set set, lnk lnk) {
        lnk lnk2;
        ClientContext clientContext2 = clientContext;
        lns a2 = a(clientContext2, 2827);
        if (a(clientContext)) {
            lnk2 = lnk;
        } else {
            lnk2 = lnk.a;
        }
        lnv lnv = new lnv(a2);
        iyu iyu = new iyu();
        iyu.a(a(File.class, a(clientContext)));
        try {
            return new lnl(lnv.a(clientContext, str, (Boolean) null, true, lnk2.e, a(set), lnk2.d, lnk2.c, lnk2.a(), lnk2.b, false, iyu), clientContext2, (String) null);
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    public final lno a(ClientContext clientContext, String str, String str2, String str3, String str4, String str5, boolean z, leg leg, lnk lnk, int i2) {
        lnk lnk2;
        ClientContext clientContext2 = clientContext;
        iva.a((Object) leg);
        lns a2 = a(clientContext, i2);
        if (!a(clientContext)) {
            lnk2 = lnk.a;
        } else {
            lnk2 = lnk;
        }
        try {
            iyu iyu = new iyu();
            iyu.a(a(FileList.class, a(clientContext)));
            Boolean bool = lnk2.e;
            Boolean bool2 = lnk2.d;
            Boolean bool3 = lnk2.c;
            String a3 = lnk2.a();
            Integer num = lnk2.b;
            StringBuilder sb = new StringBuilder("files");
            iyu.a(sb);
            iyv.a(sb, "allProperties", String.valueOf(true));
            if (bool != null) {
                iyv.a(sb, "errorRecovery", String.valueOf(bool));
            }
            if (str != null) {
                iyv.a(sb, "fileScopeAppIds", iyv.a(str));
            }
            iyv.a(sb, "maxResults", String.valueOf(100));
            if (bool2 != null) {
                iyv.a(sb, "mutationPrecondition", String.valueOf(bool2));
            }
            if (bool3 != null) {
                iyv.a(sb, "openDrive", String.valueOf(bool3));
            }
            if (str5 != null) {
                iyv.a(sb, "orderBy", iyv.a(str5));
            }
            if (str2 != null) {
                iyv.a(sb, "pageToken", iyv.a(str2));
            }
            if (str3 != null) {
                iyv.a(sb, "q", iyv.a(str3));
            }
            if (a3 != null) {
                iyv.a(sb, "reason", iyv.a(a3));
            }
            if (str4 != null) {
                iyv.a(sb, "spaces", iyv.a(str4));
            }
            if (num != null) {
                iyv.a(sb, "syncType", String.valueOf(num));
            }
            FileList fileList = (FileList) a2.a(clientContext, sb.toString(), FileList.class, z, leg);
            iva.a((Object) fileList);
            ArrayList arrayList = new ArrayList();
            for (File lnl : fileList.b) {
                arrayList.add(new lnl(lnl, clientContext, (String) null));
            }
            return new lno(arrayList, fileList.c, (Long) null);
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    public final lno a(ClientContext clientContext, Set set, String str, String str2, String str3, String str4, boolean z, leg leg, lnk lnk) {
        Set set2 = set;
        return a(clientContext, a(set), str, str2, str3, str4, z, leg, lnk, 2825);
    }

    public final lns a(ClientContext clientContext, int i2) {
        if (this.g == null) {
            this.g = a(this.i, "/drive/v2beta/", i2);
        }
        if (this.h == null) {
            this.h = a(this.i, lnp.b(), i2);
        }
        return a(clientContext) ? this.h : this.g;
    }

    public final void a(int i2, Permission permission) {
        if (i2 == 0) {
            permission.e("reader");
        } else if (i2 == 1) {
            permission.e("reader");
            if (permission.b == null) {
                permission.b = new ArrayList();
            }
            permission.b.add("commenter");
            permission.a.add(2);
        } else if (i2 == 2) {
            permission.e("writer");
        } else if (i2 == 3) {
            permission.e("owner");
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Invalid role value:");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
