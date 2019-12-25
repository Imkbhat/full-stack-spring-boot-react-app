import React, { Component } from 'react';
import './App.css';
import InstructorApp from '../src/component/InstructorApp';

class App extends Component {
  render() {
    return (
      <div className="container">
        <InstructorApp />
      </div>
    );
  }
}

export default App;
