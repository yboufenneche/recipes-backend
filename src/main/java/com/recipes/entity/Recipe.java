package com.recipes.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity

@Table(name = "recipes")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull	
	private String name;
	
	@NotNull
	private String type;
	
	private String description;
	
	private String imageUrl;

	private Date createdAt;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "recipes_ingredients",
	    joinColumns = {
	            @JoinColumn(name = "recipe_id", referencedColumnName = "id")
	    },
	    inverseJoinColumns = {
	            @JoinColumn(name = "ingredient_id", referencedColumnName = "id")
		})
	private Set<Ingredient> ingredients = new HashSet<>();
	
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}

	// Constructors
	
	public Recipe(@NotNull String name, String type, String description, String imageUrl) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.imageUrl = imageUrl;
	}
	
	public Recipe() {
	}
	
	// Getters and setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
}
