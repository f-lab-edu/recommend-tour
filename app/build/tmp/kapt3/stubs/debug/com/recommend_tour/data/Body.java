package com.recommend_tour.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/recommend_tour/data/Body;", "", "items", "Lcom/recommend_tour/data/Items;", "numOfRows", "", "pageNo", "totalCount", "(Lcom/recommend_tour/data/Items;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getItems", "()Lcom/recommend_tour/data/Items;", "setItems", "(Lcom/recommend_tour/data/Items;)V", "getNumOfRows", "()Ljava/lang/Integer;", "setNumOfRows", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPageNo", "setPageNo", "getTotalCount", "setTotalCount", "component1", "component2", "component3", "component4", "copy", "(Lcom/recommend_tour/data/Items;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/recommend_tour/data/Body;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Body {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "items")
    private com.recommend_tour.data.Items items;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "numOfRows")
    private java.lang.Integer numOfRows;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "pageNo")
    private java.lang.Integer pageNo;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "totalCount")
    private java.lang.Integer totalCount;
    
    @org.jetbrains.annotations.NotNull
    public final com.recommend_tour.data.Body copy(@org.jetbrains.annotations.Nullable
    com.recommend_tour.data.Items items, @org.jetbrains.annotations.Nullable
    java.lang.Integer numOfRows, @org.jetbrains.annotations.Nullable
    java.lang.Integer pageNo, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalCount) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Body() {
        super();
    }
    
    public Body(@org.jetbrains.annotations.Nullable
    com.recommend_tour.data.Items items, @org.jetbrains.annotations.Nullable
    java.lang.Integer numOfRows, @org.jetbrains.annotations.Nullable
    java.lang.Integer pageNo, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalCount) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recommend_tour.data.Items component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recommend_tour.data.Items getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable
    com.recommend_tour.data.Items p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNumOfRows() {
        return null;
    }
    
    public final void setNumOfRows(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPageNo() {
        return null;
    }
    
    public final void setPageNo(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalCount() {
        return null;
    }
    
    public final void setTotalCount(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
}