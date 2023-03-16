package com.pratiti.project.entity;

import javax.persistence.*;


@Entity
@NamedQuery(name="Counter.findAll", query="SELECT c FROM Counter c")
public class Counter  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int counterNumber;

	//bi-directional one-to-one association to CounterExecutive
	@OneToOne
	@JoinColumn(name="id", referencedColumnName="counter_id")
	private CounterExecutive counterExecutive;

	//bi-directional one-to-one association to Service
	@OneToOne(mappedBy="counter")
	private Service service;

	public Counter() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return this.counterNumber;
	}

	public void setName(int number) {
		this.counterNumber = number;
	}

	public CounterExecutive getCounterExecutive() {
		return this.counterExecutive;
	}

	public void setCounterExecutive(CounterExecutive counterExecutive) {
		this.counterExecutive = counterExecutive;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}