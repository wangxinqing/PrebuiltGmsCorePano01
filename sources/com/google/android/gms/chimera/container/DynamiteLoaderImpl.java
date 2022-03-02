package com.google.android.gms.chimera.container;

import android.content.Context;
import android.database.Cursor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DynamiteLoaderImpl extends mcz implements hfa {
    private static final String a = String.valueOf(DynamiteLoaderImpl.class.getName()).concat("$GmsProcessDynamiteLoaderImpl");
    private final hfa b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class GmsProcessDynamiteLoaderImpl implements hfa {
        GmsProcessDynamiteLoaderImpl() {
        }

        public final Context loadModule(Context context, String str, int i, Cursor cursor) {
            boz a;
            int i2;
            int i3 = cursor.getInt(5);
            long j = cursor.getLong(6);
            heo a2 = heo.a(context);
            if (a2 == null) {
                Log.e("DynamiteLoaderImpl", "Failed to create dynamite context.");
                return null;
            }
            bkv a3 = bkv.a((Context) a2);
            bkp bkp = new bkp();
            StrictMode.ThreadPolicy a4 = jlg.a();
            try {
                a = a3.a(bkp);
                if (j == bkp.a) {
                    i2 = 2;
                    while (true) {
                        Context a5 = a3.a((Context) a2, a, i3);
                        StrictMode.setThreadPolicy(a4);
                        return a5;
                    }
                }
                throw new InvalidConfigException("module configuration is not current");
            } catch (InvalidConfigException e) {
                if (i2 != 0) {
                    a = a3.a(bkp);
                    int a6 = hff.a(a, str, i);
                    if (a6 >= 0) {
                        i2--;
                        i3 = a6;
                    } else {
                        throw e;
                    }
                } else {
                    throw e;
                }
            } catch (InvalidConfigException e2) {
                int a7 = hff.a(a, str, i);
                if (a7 >= 0) {
                    i3 = a7;
                } else {
                    throw e2;
                }
            } catch (InvalidConfigException e3) {
                try {
                    String valueOf = String.valueOf(e3.getMessage());
                    Log.e("DynamiteLoaderImpl", valueOf.length() == 0 ? new String("Failed to load module from gms config:") : "Failed to load module from gms config:".concat(valueOf));
                    return null;
                } finally {
                    StrictMode.setThreadPolicy(a4);
                }
            }
        }

        public final Cursor queryForDynamiteModule(Context context, String str, boolean z) {
            return hff.a().a(context, (jlm) null, mcx.a(str, z), z, false);
        }
    }

    public DynamiteLoaderImpl() {
        hfa hfa;
        if (ihs.a()) {
            ClassLoader classLoader = getClass().getClassLoader();
            amtf.a((Object) classLoader);
            hfa = (hfa) classLoader.loadClass(a).asSubclass(hfa.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } else {
            hfa = null;
        }
        this.b = hfa;
    }

    private final hfa a() {
        hfa hfa = this.b;
        return hfa != null ? hfa : this;
    }

    public mby createModuleContext(mby mby, String str, int i) {
        Context context = (Context) mbz.a(mby);
        if (context == null) {
            return mbz.a((Object) null);
        }
        try {
            return createModuleContextNoCrashUtils(mby, str, i);
        } catch (Throwable th) {
            if (!jim.a()) {
                jis.a(context, th);
            }
            throw th;
        }
    }

    public mby createModuleContextNoCrashUtils(mby mby, String str, int i) {
        Cursor queryForDynamiteModule;
        Context context = (Context) mbz.a(mby);
        if (context == null) {
            return mbz.a((Object) null);
        }
        hfa a2 = a();
        try {
            queryForDynamiteModule = a2.queryForDynamiteModule(context, str, false);
            if (queryForDynamiteModule != null) {
                if (queryForDynamiteModule.moveToFirst()) {
                    if (queryForDynamiteModule.getInt(0) < i) {
                        Log.e("DynamiteLoaderImpl", "Requested feature version is not available.");
                        mby a3 = mbz.a((Object) null);
                        queryForDynamiteModule.close();
                        return a3;
                    }
                    mby a4 = mbz.a((Object) a2.loadModule(context, str, i, queryForDynamiteModule));
                    queryForDynamiteModule.close();
                    return a4;
                }
            }
            Log.w("DynamiteLoaderImpl", "Failed to load remote feature.");
            mby a5 = mbz.a((Object) null);
            if (queryForDynamiteModule != null) {
                queryForDynamiteModule.close();
            }
            return a5;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Error creating module context: ");
            sb.append(valueOf);
            Log.e("DynamiteLoaderImpl", sb.toString());
            throw th;
        }
        throw th;
    }

    public int getIDynamiteLoaderVersion() {
        return 2;
    }

    public int getModuleVersion(mby mby, String str) {
        return getModuleVersion2(mby, str, true);
    }

    public int getModuleVersion2(mby mby, String str, boolean z) {
        Context context = (Context) mbz.a(mby);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return 0;
        }
        try {
            return getModuleVersion2NoCrashUtils(mby, str, z);
        } catch (Exception e) {
            if (!jim.a()) {
                jis.a(context, e);
            }
            throw e;
        }
    }

    public int getModuleVersion2NoCrashUtils(mby mby, String str, boolean z) {
        Cursor queryForDynamiteModule;
        Context context = (Context) mbz.a(mby);
        if (context == null) {
            Log.w("DynamiteLoaderImpl", "Invalid client Context.");
            return 0;
        }
        try {
            queryForDynamiteModule = a().queryForDynamiteModule(context, str, z);
            if (queryForDynamiteModule != null) {
                if (queryForDynamiteModule.moveToFirst()) {
                    int i = queryForDynamiteModule.getInt(0);
                    queryForDynamiteModule.close();
                    return i;
                }
            }
            Log.w("DynamiteLoaderImpl", "Failed to retrieve remote feature version.");
            if (queryForDynamiteModule != null) {
                queryForDynamiteModule.close();
            }
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteLoaderImpl", "Error retrieving remote feature version: ", e);
            return 0;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public Context loadModule(Context context, String str, int i, Cursor cursor) {
        return mdg.a(context).a(context, str, i, cursor);
    }

    public Cursor queryForDynamiteModule(Context context, String str, boolean z) {
        return mcx.b(context, str, z);
    }
}
