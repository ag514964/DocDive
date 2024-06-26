package com.abhiappforge.android.docdive.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002\u00a8\u0006\f"}, d2 = {"Lcom/abhiappforge/android/docdive/framework/FileUtil;", "", "()V", "getDocumentDetails", "Lcom/abhiappforge/android/docdive/framework/FileUtil$DocumentDetail;", "context", "Landroid/content/Context;", "documentUri", "", "getPdfThumbnailUri", "documentName", "DocumentDetail", "app_debug"})
public final class FileUtil {
    public static final com.abhiappforge.android.docdive.framework.FileUtil INSTANCE = null;
    
    private final java.lang.String getPdfThumbnailUri(android.content.Context context, java.lang.String documentUri, java.lang.String documentName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abhiappforge.android.docdive.framework.FileUtil.DocumentDetail getDocumentDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String documentUri) {
        return null;
    }
    
    private FileUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/abhiappforge/android/docdive/framework/FileUtil$DocumentDetail;", "", "name", "", "size", "", "thumbnail", "(Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSize", "()I", "getThumbnail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class DocumentDetail {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final int size = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String thumbnail = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getSize() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumbnail() {
            return null;
        }
        
        public DocumentDetail(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int size, @org.jetbrains.annotations.NotNull()
        java.lang.String thumbnail) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.abhiappforge.android.docdive.framework.FileUtil.DocumentDetail copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, int size, @org.jetbrains.annotations.NotNull()
        java.lang.String thumbnail) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}