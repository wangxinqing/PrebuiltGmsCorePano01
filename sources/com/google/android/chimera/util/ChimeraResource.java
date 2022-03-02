package com.google.android.chimera.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Map;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraResource {
    private static final Map a = qug.a();

    private ChimeraResource() {
    }

    private static int a(ClassLoader classLoader, Resources resources, String str) {
        bsw bsw;
        Integer num;
        synchronized (a) {
            bsw = (bsw) a.get(classLoader);
            if (bsw == null) {
                String a2 = a(classLoader, resources);
                if (a2 != null) {
                    bsw = new bsw(a2);
                } else {
                    bsw = bsw.c;
                }
                a.put(classLoader, bsw);
            }
            if (bsw == bsw.c) {
                bsw = null;
            }
        }
        if (bsw != null) {
            String str2 = bsw.a;
            synchronized (bsw.b) {
                num = (Integer) bsw.b.get(str);
            }
            if (num != null) {
                return num.intValue();
            }
            try {
                Integer valueOf = Integer.valueOf(resources.getIdentifier(str, (String) null, str2));
                synchronized (bsw.b) {
                    bsw.b.put(str, valueOf);
                }
                return valueOf.intValue();
            } catch (Resources.NotFoundException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + str2.length());
                sb.append("Unable to locate resource id for resourceName:");
                sb.append(str);
                sb.append(" and resourcePackage: ");
                sb.append(str2);
                Log.e("ChimeraResource", sb.toString(), e);
                throw e;
            }
        } else {
            throw new Resources.NotFoundException("Failed to get resource package name for module");
        }
    }

    public static int getResourceId(Context context, Resources resources, Resources resources2, int i) {
        return getResourceId(context.getApplicationContext().getClassLoader(), resources, resources2, i);
    }

    public static int getResourceId(ClassLoader classLoader, Resources resources, Resources resources2, int i) {
        String str;
        if (i == 0) {
            return 0;
        }
        try {
            String resourceName = resources2.getResourceName(i);
            if (resourceName.charAt(0) == '@') {
                resourceName = resourceName.substring(1);
            }
            int indexOf = resourceName.indexOf(58);
            if (indexOf != -1) {
                str = resourceName.substring(0, indexOf);
                resourceName = resourceName.substring(indexOf + 1);
            } else {
                str = null;
            }
            if (str == null || !str.equals("android")) {
                return a(classLoader, resources, resourceName);
            }
            return i;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb = new StringBuilder(98);
            sb.append("Unable to load resource information for source themeId: ");
            sb.append(i);
            sb.append(". Module theme will not be set.");
            Log.e("ChimeraResource", sb.toString(), e);
            throw e;
        }
    }

    private static String a(ClassLoader classLoader, Resources resources) {
        try {
            try {
                try {
                    return resources.getResourcePackageName(classLoader.loadClass("com.google.android.chimeraresources.R$id").getField("chimera").getInt(0));
                } catch (Resources.NotFoundException e) {
                    Log.w("ChimeraResource", e.toString());
                    return null;
                }
            } catch (NoSuchFieldException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("The resource chimera could not be found: ");
                sb.append(valueOf);
                Log.e("ChimeraResource", sb.toString());
                return null;
            } catch (IllegalAccessException | IllegalArgumentException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                sb2.append("Failed to get resource ID for chimera: ");
                sb2.append(valueOf2);
                Log.e("ChimeraResource", sb2.toString());
                return null;
            }
        } catch (ClassNotFoundException e4) {
            return null;
        }
    }
}
