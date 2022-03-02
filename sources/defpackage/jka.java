package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: jka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jka {
    public static final Uri a = MediaStore.Images.Media.getContentUri("phoneStorage");

    public static Bitmap a(Context context, Uri uri) {
        Bitmap a2;
        int a3 = jju.a(context);
        Bitmap bitmap = null;
        if (uri != null && b(uri)) {
            ContentResolver contentResolver = context.getContentResolver();
            long parseId = ContentUris.parseId(uri);
            String a4 = jju.a(contentResolver, uri);
            if (jju.b(a4)) {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, 1, (BitmapFactory.Options) null);
            } else if (jju.c(a4)) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, 1, (BitmapFactory.Options) null);
            } else if (Log.isLoggable("MediaStoreUtils", 5)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 42 + String.valueOf(valueOf).length());
                sb.append("getThumbnail: unrecognized mimeType=");
                sb.append(a4);
                sb.append(", uri=");
                sb.append(valueOf);
                Log.w("MediaStoreUtils", sb.toString());
                return null;
            }
            if (bitmap != null) {
                bitmap = jju.a(contentResolver, uri, bitmap, false);
                if (!((bitmap.getWidth() == a3 && bitmap.getHeight() == a3) || (a2 = jju.a(bitmap, a3, a3)) == bitmap)) {
                    bitmap.recycle();
                    return a2;
                }
            }
        }
        return bitmap;
    }

    public static boolean b(Uri uri) {
        if (!a(uri)) {
            return false;
        }
        String path = uri.getPath();
        return path.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPath()) || path.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.getPath());
    }

    public static String a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
        if (query == null) {
            if (Log.isLoggable("MediaStoreUtils", 5)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("getFilePath: query returned null cursor for uri=");
                sb.append(valueOf);
                Log.w("MediaStoreUtils", sb.toString());
            }
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    query.close();
                    return string;
                } else if (Log.isLoggable("MediaStoreUtils", 5)) {
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                    sb2.append("getFilePath: MediaColumns.DATA was empty for uri=");
                    sb2.append(valueOf2);
                    Log.w("MediaStoreUtils", sb2.toString());
                }
            } else if (Log.isLoggable("MediaStoreUtils", 5)) {
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 49);
                sb3.append("getFilePath: query returned empty cursor for uri=");
                sb3.append(valueOf3);
                Log.w("MediaStoreUtils", sb3.toString());
            }
            return null;
        } finally {
            query.close();
        }
    }

    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
