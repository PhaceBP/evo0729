package hu.evosoft.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorLabSolution {

	static enum Status {
		ACTIVE, DONE;
	}

	static class Todo {

		private String todoId;
		private String description;
		private String nameOfOwner;
		private Status status;

		public Todo(String todoId, String description, String nameOfOwner, Status status) {
			super();
			this.todoId = todoId;
			this.description = description;
			this.nameOfOwner = nameOfOwner;
			this.status = status;
		}

		public String getTodoId() {
			return todoId;
		}

		public void setTodoId(String todoId) {
			this.todoId = todoId;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNameOfOwner() {
			return nameOfOwner;
		}

		public void setNameOfOwner(String nameOfOwner) {
			this.nameOfOwner = nameOfOwner;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Todo [todoId=" + todoId + ", description=" + description + ", nameOfOwner=" + nameOfOwner
					+ ", status=" + status + "]";
		}

	}

	public static void main(String[] args) {

		List<Todo> emps = new ArrayList<Todo>();

		emps.add(new Todo("todo1", "desc1", "Attila", Status.ACTIVE));
		emps.add(new Todo("todo2", null, "Lajos", Status.ACTIVE));
		emps.add(new Todo("todo3", "desc3", "Bela", Status.ACTIVE));
		emps.add(new Todo("todo4", "desc4", "Robert", Status.DONE));
	}

	private List<Todo> sortByTodoId(List<Todo> todos) {
		return todos.stream().sorted(Comparator.comparing(Todo::getTodoId)).collect(Collectors.toList());
	}

	private List<Todo> sortByDescriptionNullFirst(List<Todo> todos) {
		return todos.stream()
				.sorted(Comparator.comparing(Todo::getDescription, Comparator.nullsFirst(Comparator.naturalOrder())))
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
